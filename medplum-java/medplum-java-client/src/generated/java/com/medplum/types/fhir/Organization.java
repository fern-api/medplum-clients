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
  String resourceType();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<ContactPoint>> telecom();

  Optional<Id> id();

  Optional<Boolean> active();

  Optional<List<Reference>> endpoint();

  Optional<Reference> partOf();

  Optional<List<Organization_Contact>> contact();

  Optional<Uri> implicitRules();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<List<String>> alias();

  Optional<List<CodeableConcept>> type();

  Optional<List<Address>> address();

  Optional<Meta> meta();

  static ImmutableOrganization.ResourceTypeBuildStage builder() {
    return ImmutableOrganization.builder();
  }
}
