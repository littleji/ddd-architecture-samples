package study.huhao.demo.domain.models.blog.exceptions;

import study.huhao.demo.domain.core.excpetions.AggregateException;

public class AuthorIsNullException extends AggregateException {
    public AuthorIsNullException() {
        super("the author cannot be null");
    }
}
