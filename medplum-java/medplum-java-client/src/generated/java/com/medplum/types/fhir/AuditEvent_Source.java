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
    as = ImmutableAuditEvent_Source.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AuditEvent_Source {
  Optional<List<Extension>> modifierExtension();

  Optional<List<Coding>> type();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Reference observer();

  Optional<String> site();

  static ImmutableAuditEvent_Source.ObserverBuildStage builder() {
    return ImmutableAuditEvent_Source.builder();
  }
}
