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
    as = ImmutableContract_ContentDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_ContentDefinition {
  Optional<String> id();

  Optional<Reference> publisher();

  Optional<Markdown> copyright();

  Optional<DateTime> publicationDate();

  CodeableConcept type();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> publicationStatus();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> subType();

  static ImmutableContract_ContentDefinition.TypeBuildStage builder() {
    return ImmutableContract_ContentDefinition.builder();
  }
}
