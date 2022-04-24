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
    as = ImmutableContract_Party.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Party {
  Optional<List<Extension>> extension();

  CodeableConcept role();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  List<Reference> reference();

  static ImmutableContract_Party.RoleBuildStage builder() {
    return ImmutableContract_Party.builder();
  }
}
