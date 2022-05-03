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
  Optional<Reference> publisher();

  CodeableConcept type();

  Optional<DateTime> publicationDate();

  Optional<Code> publicationStatus();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> subType();

  Optional<Markdown> copyright();

  Optional<List<Extension>> extension();

  static ImmutableContract_ContentDefinition.TypeBuildStage builder() {
    return ImmutableContract_ContentDefinition.builder();
  }
}
