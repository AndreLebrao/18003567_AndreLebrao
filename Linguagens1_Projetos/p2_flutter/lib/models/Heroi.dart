class Heroi{
  String _imagemURL;
  String _nome;
  String _genero;
  String _apelido;
  String _individualidade;
  String _afiliacao;
  String _aniversario;

  Heroi(this._imagemURL, this._nome, this._genero, this._apelido,
      this._individualidade, this._afiliacao, this._aniversario);

  String get aniversario => _aniversario;

  set aniversario(String value) {
    _aniversario = value;
  }

  String get afiliacao => _afiliacao;

  set afiliacao(String value) {
    _afiliacao = value;
  }

  String get individualidade => _individualidade;

  set individualidade(String value) {
    _individualidade = value;
  }

  String get apelido => _apelido;

  set apelido(String value) {
    _apelido = value;
  }

  String get genero => _genero;

  set genero(String value) {
    _genero = value;
  }

  String get nome => _nome;

  set nome(String value) {
    _nome = value;
  }

  String get imagemURL => _imagemURL;

  set imagemURL(String value) {
    _imagemURL = value;
  }
}