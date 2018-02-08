package no.sysco.middleware.tramodana.infrastructure.messaging.kafka

object Boot extends App {
  val configs = Configs.buildServerConfig()
  val kafkaTraceConsumer = new KafkaTraceConsumer(configs.kafkaConfig.bootstrapServers)
  kafkaTraceConsumer.run()
}
