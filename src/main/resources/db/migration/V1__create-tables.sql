CREATE TABLE tbl_categories (
                                id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                all_categories BOOLEAN,
                                education BOOLEAN,
                                family BOOLEAN,
                                important BOOLEAN,
                                advertising BOOLEAN,
                                social BOOLEAN
);

CREATE TABLE tbl_preferences (
                                 id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                 categories_id BIGINT,
                                 theme VARCHAR(255),
                                 CONSTRAINT fk_preferences_categories FOREIGN KEY (categories_id) REFERENCES tbl_categories(id)
);

CREATE TABLE tbl_users (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           mail_address VARCHAR(255) NOT NULL UNIQUE,
                           password VARCHAR(255) NOT NULL,
                           preferences_id BIGINT,
                           FOREIGN KEY (preferences_id) REFERENCES tbl_preferences(id)
);

CREATE TABLE tbl_mails (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           receiver_id BIGINT,
                           sender_id BIGINT,
                           categories_id BIGINT,
                           title VARCHAR(255),
                           body TEXT,
                           CONSTRAINT fk_mails_receiver FOREIGN KEY (receiver_id) REFERENCES tbl_users(id),
                           CONSTRAINT fk_mails_sender FOREIGN KEY (sender_id) REFERENCES tbl_users(id),
                           CONSTRAINT fk_mails_categories FOREIGN KEY (categories_id) REFERENCES tbl_categories(id)
);
