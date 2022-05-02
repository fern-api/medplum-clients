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
    as = ImmutableOrganizationAffiliation.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface OrganizationAffiliation {
  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> specialty();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> period();

  Optional<List<Reference>> network();

  Optional<List<Reference>> healthcareService();

  String resourceType();

  Optional<List<ContactPoint>> telecom();

  Optional<Id> id();

  Optional<List<Reference>> endpoint();

  Optional<List<CodeableConcept>> code();

  Optional<Boolean> active();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Reference> organization();

  Optional<Reference> participatingOrganization();

  Optional<Meta> meta();

  Optional<List<Reference>> location();

  static ImmutableOrganizationAffiliation.ResourceTypeBuildStage builder() {
    return ImmutableOrganizationAffiliation.builder();
  }
}
