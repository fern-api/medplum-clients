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
    as = ImmutablePractitioner.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Practitioner {
  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<Code> language();

  Optional<List<Address>> address();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<HumanName>> name();

  Optional<List<Practitioner_Qualification>> qualification();

  Optional<List<CodeableConcept>> communication();

  Optional<Narrative> text();

  Optional<Date> birthDate();

  Optional<List<Extension>> extension();

  Optional<List<ContactPoint>> telecom();

  Optional<PractitionerGender> gender();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> active();

  Optional<List<Identifier>> identifier();

  Optional<List<Attachment>> photo();

  Optional<Uri> implicitRules();

  static ImmutablePractitioner.ResourceTypeBuildStage builder() {
    return ImmutablePractitioner.builder();
  }
}
