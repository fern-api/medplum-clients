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
    as = ImmutableContract_Party.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Party {
  List<Reference> reference();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept role();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableContract_Party.RoleBuildStage builder() {
    return ImmutableContract_Party.builder();
  }
}
