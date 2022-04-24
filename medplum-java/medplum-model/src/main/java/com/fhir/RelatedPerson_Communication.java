package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableRelatedPerson_Communication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RelatedPerson_Communication {
  Optional<List<Extension>> extension();

  Optional<Boolean> preferred();

  Optional<List<Extension>> modifierExtension();

  CodeableConcept language();

  Optional<String> id();

  static ImmutableRelatedPerson_Communication.LanguageBuildStage builder() {
    return ImmutableRelatedPerson_Communication.builder();
  }
}
