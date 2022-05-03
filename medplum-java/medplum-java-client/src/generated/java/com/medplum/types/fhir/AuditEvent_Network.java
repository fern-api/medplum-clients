package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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

  Optional<List<Extension>> extension();

  Optional<Auditevent_networkType> type();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  static ImmutableAuditEvent_Network.Builder builder() {
    return ImmutableAuditEvent_Network.builder();
  }
}
