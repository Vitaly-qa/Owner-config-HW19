

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


@Tag("simple")
public class GitHubTest extends TestBase {


    @Test
    void checkTitleOfSmallAndMediumTeamsPage() {
        open("/");
        $(byTagAndText("button", "Solutions")).hover();
        $(byText("Team")).click();

        $(".font-mktg").shouldHave(text("Build like the best teams on the planet"));
    }

}













