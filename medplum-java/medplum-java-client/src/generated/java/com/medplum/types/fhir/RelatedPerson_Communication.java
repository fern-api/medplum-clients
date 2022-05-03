package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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

  CodeableConcept language();

  Optional<String> id();

  Optional<Boolean> preferred();

  Optional<List<Extension>> modifierExtension();

  static ImmutableRelatedPerson_Communication.LanguageBuildStage builder() {
    return ImmutableRelatedPerson_Communication.builder();
  }
}
