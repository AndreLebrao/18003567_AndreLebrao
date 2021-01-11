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

  @override
  String toString() {
    return 'Heroi{_imagemURL: $_imagemURL, _nome: $_nome, _genero: $_genero, _apelido: $_apelido, _individualidade: $_individualidade, _afiliacao: $_afiliacao, _aniversario: $_aniversario}';
  }

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is Heroi &&
          runtimeType == other.runtimeType &&
          _imagemURL == other._imagemURL &&
          _nome == other._nome &&
          _genero == other._genero &&
          _apelido == other._apelido &&
          _individualidade == other._individualidade &&
          _afiliacao == other._afiliacao &&
          _aniversario == other._aniversario;

  String get afiliacao => _afiliacao;

  String get individualidade => _individualidade;

  String get apelido => _apelido;

  String get genero => _genero;

  String get nome => _nome;

  String get imagemURL => _imagemURL;
}