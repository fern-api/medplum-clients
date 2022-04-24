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
    as = ImmutableRelatedPerson.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface RelatedPerson {
  Optional<uri> implicitRules();

  Optional<List<Attachment>> photo();

  Optional<date> birthDate();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> relationship();

  Optional<RelatedpersonGender> gender();

  Optional<List<RelatedPerson_Communication>> communication();

  Optional<id> id();

  String resourceType();

  Optional<Period> period();

  Optional<List<Extension>> modifierExtension();

  Reference patient();

  Optional<List<HumanName>> name();

  Optional<List<Identifier>> identifier();

  Optional<List<ContactPoint>> telecom();

  Optional<code> language();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<Boolean> active();

  Optional<List<Address>> address();

  static ImmutableRelatedPerson.ResourceTypeBuildStage builder() {
    return ImmutableRelatedPerson.builder();
  }
}
