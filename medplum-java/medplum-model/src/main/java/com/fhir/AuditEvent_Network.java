package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableAuditEvent_Network.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AuditEvent_Network {
  Optional<String> address();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<Auditevent_networkType> type();

  Optional<List<Extension>> extension();

  static ImmutableAuditEvent_Network.Builder builder() {
    return ImmutableAuditEvent_Network.builder();
  }
}
