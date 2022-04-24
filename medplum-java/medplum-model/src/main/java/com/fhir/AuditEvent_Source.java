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
    as = ImmutableAuditEvent_Source.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AuditEvent_Source {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Coding>> type();

  Optional<String> site();

  Optional<List<Extension>> extension();

  Reference observer();

  static ImmutableAuditEvent_Source.ObserverBuildStage builder() {
    return ImmutableAuditEvent_Source.builder();
  }
}
