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
    as = ImmutableOrganizationAffiliation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OrganizationAffiliation {
  Optional<List<ResourceList>> contained();

  Optional<Period> period();

  String resourceType();

  Optional<List<Reference>> location();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Reference>> network();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Reference>> endpoint();

  Optional<List<Extension>> extension();

  Optional<Reference> organization();

  Optional<List<Reference>> healthcareService();

  Optional<code> language();

  Optional<List<CodeableConcept>> code();

  Optional<Boolean> active();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> implicitRules();

  Optional<Narrative> text();

  Optional<id> id();

  Optional<Reference> participatingOrganization();

  Optional<List<Identifier>> identifier();

  static ImmutableOrganizationAffiliation.ResourceTypeBuildStage builder() {
    return ImmutableOrganizationAffiliation.builder();
  }
}
