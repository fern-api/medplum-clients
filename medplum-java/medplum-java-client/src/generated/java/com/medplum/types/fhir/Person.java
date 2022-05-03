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
    as = ImmutablePerson.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Person {
  Optional<Narrative> text();

  Optional<List<HumanName>> name();

  Optional<PersonGender> gender();

  Optional<Attachment> photo();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactPoint>> telecom();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<Boolean> active();

  Optional<Reference> managingOrganization();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<List<Address>> address();

  Optional<List<Person_Link>> link();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  Optional<Date> birthDate();

  String resourceType();

  static ImmutablePerson.ResourceTypeBuildStage builder() {
    return ImmutablePerson.builder();
  }
}
