CREATE TABLE tbl_categories (
                                id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                allCategories TINYINT(1),
                                education TINYINT(1),
                                family TINYINT(1),
                                important TINYINT(1),
                                advertising TINYINT(1),
                                social TINYINT(1)
);

CREATE TABLE tbl_preferences (
                                 id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                 categories_id BIGINT,
                                 theme VARCHAR(255),
                                 CONSTRAINT fk_preferences_categories FOREIGN KEY (categories_id) REFERENCES tbl_categories(id)
);

CREATE TABLE tbl_users (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(255),
                           email VARCHAR(255),
                           password VARCHAR(255),
                           preferences_id BIGINT,
                           CONSTRAINT fk_user_preferences FOREIGN KEY (preferences_id) REFERENCES tbl_preferences(id)
);

CREATE TABLE tbl_mails (
                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                           senderId BIGINT,
                           title VARCHAR(255),
                           body TEXT,
                           user_id BIGINT,
                           categories_id BIGINT,
                           CONSTRAINT fk_mail_user FOREIGN KEY (user_id) REFERENCES tbl_users(id),
                           CONSTRAINT fk_mail_categories FOREIGN KEY (categories_id) REFERENCES tbl_categories(id)
);