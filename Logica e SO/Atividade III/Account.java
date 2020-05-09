/**
 * Grupo Kali
 * André Lebrão Aigner Ribeiro - 18.00356-7
 * João Guilherme Martins Jatobá - 18.01790-8
 * João Pedro de Padua Santoro Azevedo - 18.02227-4
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
public class Account {

	private static int saldo = 500;

	private final Lock lock = new ReentrantLock();
	private final Condition usandoConta = lock.newCondition();

	public void deposit(int number) throws InterruptedException {
		lock.lock();
		try {
				saldo+=number;
				System.out.printf("%s : depositou %d na conta\n", 
				Thread.currentThread().getName(), number);
		}
		finally {
			lock.unlock();
		}
	}

	// Remove um número da fila
	public void withdraw(int number) throws InterruptedException {
		lock.lock();
		try {
				if(number<=saldo){
					saldo-=number;
					System.out.printf("%s : sacou %d\n", 
					Thread.currentThread().getName(), number);
					System.out.println(Thread.currentThread().getName() + " : sobrou "+saldo);
				}
		} finally {
			lock.unlock();
		}
	}

}
