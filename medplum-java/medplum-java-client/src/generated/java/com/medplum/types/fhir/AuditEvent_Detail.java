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
    as = ImmutableAuditEvent_Detail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AuditEvent_Detail {
  Optional<String> type();

  Optional<String> valueString();

  Optional<String> valueBase64Binary();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableAuditEvent_Detail.Builder builder() {
    return ImmutableAuditEvent_Detail.builder();
  }
}
