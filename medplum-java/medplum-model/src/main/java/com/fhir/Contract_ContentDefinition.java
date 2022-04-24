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
    as = ImmutableContract_ContentDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_ContentDefinition {
  Optional<markdown> copyright();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> publisher();

  CodeableConcept type();

  Optional<CodeableConcept> subType();

  Optional<List<Extension>> extension();

  Optional<dateTime> publicationDate();

  Optional<code> publicationStatus();

  static ImmutableContract_ContentDefinition.TypeBuildStage builder() {
    return ImmutableContract_ContentDefinition.builder();
  }
}
