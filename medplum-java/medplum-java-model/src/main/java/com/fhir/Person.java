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
    as = ImmutablePerson.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Person {
  Optional<Narrative> text();

  Optional<code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> managingOrganization();

  Optional<List<Extension>> extension();

  Optional<List<HumanName>> name();

  Optional<PersonGender> gender();

  Optional<date> birthDate();

  Optional<Attachment> photo();

  Optional<List<Person_Link>> link();

  Optional<uri> implicitRules();

  Optional<List<Address>> address();

  Optional<List<ContactPoint>> telecom();

  Optional<id> id();

  Optional<Boolean> active();

  Optional<Meta> meta();

  String resourceType();

  Optional<List<Identifier>> identifier();

  static ImmutablePerson.ResourceTypeBuildStage builder() {
    return ImmutablePerson.builder();
  }
}
