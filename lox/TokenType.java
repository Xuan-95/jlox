package lox;

enum TokenType {
    // Single-characters tokens
    LEFT_BRACE, RIGHT_BRACE,
    LEFT_PAREN, RIGHT_PAREN,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    // Multiple characters tokens
    BANG, BANG_EQUAL,
    GREATER, GREATER_EQUAL,
    EQUAL, EQUAL_EQUAL,
    LESS, LESS_EQUAL,

    //Literals
    STRING, NUMBER, IDENTIFIER,

    // Reserved keywords
    AND, OR, 
    IF, ELSE, WHILE, FOR, 
    VAR, TRUE, FALSE, NIL, 
    FUN, RETURN, CLASS, THIS, SUPER, 
    PRINT,

    EOF
}
