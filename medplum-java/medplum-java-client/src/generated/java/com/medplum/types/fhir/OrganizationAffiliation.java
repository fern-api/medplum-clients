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
  Optional<List<Reference>> healthcareService();

  Optional<Reference> participatingOrganization();

  Optional<Reference> organization();

  Optional<Meta> meta();

  Optional<List<Reference>> network();

  Optional<Id> id();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> code();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> location();

  Optional<List<Reference>> endpoint();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<Boolean> active();

  Optional<Period> period();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Identifier>> identifier();

  static ImmutableOrganizationAffiliation.ResourceTypeBuildStage builder() {
    return ImmutableOrganizationAffiliation.builder();
  }
}
