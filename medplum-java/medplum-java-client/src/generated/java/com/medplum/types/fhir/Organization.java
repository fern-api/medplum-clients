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
  Optional<List<ContactPoint>> telecom();

  Optional<Meta> meta();

  Optional<String> name();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<List<String>> alias();

  Optional<List<CodeableConcept>> type();

  Optional<List<Organization_Contact>> contact();

  Optional<List<Address>> address();

  Optional<List<Reference>> endpoint();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> partOf();

  Optional<Code> language();

  String resourceType();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Boolean> active();

  static ImmutableOrganization.ResourceTypeBuildStage builder() {
    return ImmutableOrganization.builder();
  }
}
