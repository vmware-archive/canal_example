package canal.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PipelineJsonTest {

    @Test
    fun `Test existence of pipelines`() {
        assertThat(pipelines.pipelinesForApp.keys).containsExactly("app1", "app2")
        assertThat(pipelines.pipelinesForApp["app1"]?.map { it.name }).containsExactly("just waiting")
        assertThat(pipelines.pipelinesForApp["app2"]?.map { it.name })
                .containsExactly("just judging", "waiting then judging")
    }

}
