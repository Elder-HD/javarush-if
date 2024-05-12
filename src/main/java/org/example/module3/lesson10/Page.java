package org.example.module3.lesson10;

import lombok.Getter;

@Getter
public class Page implements QueryParameter {
    private final int page;
    private final int perPage;

    private Page(Builder builder) {
        this.page = builder.page;
        this.perPage = builder.perPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String query() {
        return String.format("page=%d&per_page=%d", page, perPage);
    }

    public static class Builder {
        private int page;
        private int perPage;

        private Builder() {

        }

        public Builder withPage(int page) {
            this.page = page;
            return this;
        }

        public Builder withPerPage(int perPage) {
            this.perPage = perPage;
            return this;
        }

        public Page build() {
            return new Page(this);
        }
    }
}
