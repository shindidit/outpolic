package outpolic.user.search.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Contents {
	private String contentsId;
	private String contentsType;
	private String contentsTitle;
    private String enterName;
    private LocalDateTime  registrationDate;
}
