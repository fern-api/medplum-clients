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
    as = ImmutableAuditEvent_Detail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AuditEvent_Detail {
  Optional<String> valueBase64Binary();

  Optional<List<Extension>> extension();

  Optional<String> type();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueString();

  Optional<String> id();

  static ImmutableAuditEvent_Detail.Builder builder() {
    return ImmutableAuditEvent_Detail.builder();
  }
}
