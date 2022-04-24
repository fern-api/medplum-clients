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
    as = ImmutableOrganization.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Organization {
  Optional<code> language();

  Optional<List<CodeableConcept>> type();

  Optional<uri> implicitRules();

  String resourceType();

  Optional<Reference> partOf();

  Optional<List<Identifier>> identifier();

  Optional<List<ContactPoint>> telecom();

  Optional<Boolean> active();

  Optional<List<Address>> address();

  Optional<List<Organization_Contact>> contact();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<List<ResourceList>> contained();

  Optional<id> id();

  Optional<String> name();

  Optional<List<Reference>> endpoint();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<String>> alias();

  static ImmutableOrganization.ResourceTypeBuildStage builder() {
    return ImmutableOrganization.builder();
  }
}
