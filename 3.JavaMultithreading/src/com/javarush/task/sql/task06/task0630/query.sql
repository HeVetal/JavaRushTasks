ALTER TABLE event
    ADD FOREIGN KEY (user_id)
        REFERENCES users (id)