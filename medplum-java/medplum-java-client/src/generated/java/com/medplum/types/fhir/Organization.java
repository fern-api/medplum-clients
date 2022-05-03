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
  Optional<Narrative> text();

  Optional<Reference> partOf();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Address>> address();

  Optional<Code> language();

  Optional<List<ContactPoint>> telecom();

  Optional<List<ResourceList>> contained();

  Optional<Boolean> active();

  Optional<List<Reference>> endpoint();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> alias();

  Optional<List<CodeableConcept>> type();

  Optional<List<Organization_Contact>> contact();

  Optional<List<Identifier>> identifier();

  Optional<String> name();

  static ImmutableOrganization.ResourceTypeBuildStage builder() {
    return ImmutableOrganization.builder();
  }
}
