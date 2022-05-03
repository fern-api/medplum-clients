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
  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Extension>> extension();

  Optional<Reference> organization();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Reference>> location();

  Optional<List<Reference>> healthcareService();

  Optional<Boolean> active();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> network();

  Optional<List<Reference>> endpoint();

  Optional<Period> period();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Reference> participatingOrganization();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> modifierExtension();

  String resourceType();

  Optional<List<CodeableConcept>> code();

  static ImmutableOrganizationAffiliation.ResourceTypeBuildStage builder() {
    return ImmutableOrganizationAffiliation.builder();
  }
}
