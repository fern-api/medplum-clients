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
    as = ImmutablePractitioner.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Practitioner {
  Optional<List<Extension>> modifierExtension();

  Optional<id> id();

  Optional<List<HumanName>> name();

  Optional<List<Practitioner_Qualification>> qualification();

  Optional<PractitionerGender> gender();

  Optional<List<Address>> address();

  Optional<List<CodeableConcept>> communication();

  Optional<List<Attachment>> photo();

  Optional<date> birthDate();

  Optional<List<ContactPoint>> telecom();

  Optional<code> language();

  String resourceType();

  Optional<uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<Boolean> active();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  static ImmutablePractitioner.ResourceTypeBuildStage builder() {
    return ImmutablePractitioner.builder();
  }
}
