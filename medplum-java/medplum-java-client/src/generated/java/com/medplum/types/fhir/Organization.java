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
    as = ImmutableOrganization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Organization {
  Optional<String> name();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<List<Address>> address();

  Optional<List<Extension>> extension();

  Optional<List<String>> alias();

  Optional<Reference> partOf();

  Optional<List<Reference>> endpoint();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Organization_Contact>> contact();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<Boolean> active();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> type();

  static ImmutableOrganization.ResourceTypeBuildStage builder() {
    return ImmutableOrganization.builder();
  }
}
