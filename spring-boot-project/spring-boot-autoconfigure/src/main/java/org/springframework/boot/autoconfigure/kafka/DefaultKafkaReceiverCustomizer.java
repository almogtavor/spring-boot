/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.kafka;

import reactor.kafka.receiver.internals.DefaultKafkaReceiver;

/**
 * Callback interface for customizing
 * {@code reactor.kafka.receiver.internals.DefaultKafkaReceiver} beans.
 *
 * @author Almog Tavor
 * @since 2.7.0
 */
@FunctionalInterface
public interface DefaultKafkaReceiverCustomizer {

	/**
	 * Customize the {@link DefaultKafkaReceiver}.
	 * @param receiverFactory the receiver factory to customize
	 */
	void customize(DefaultKafkaReceiver<?, ?> receiverFactory);

}
