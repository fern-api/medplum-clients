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
  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactPoint>> telecom();

  Optional<Boolean> active();

  String resourceType();

  Optional<List<CodeableConcept>> code();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Reference> participatingOrganization();

  Optional<Period> period();

  Optional<List<Reference>> healthcareService();

  Optional<List<Reference>> network();

  Optional<List<CodeableConcept>> specialty();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> endpoint();

  Optional<List<Identifier>> identifier();

  Optional<Reference> organization();

  Optional<List<Reference>> location();

  Optional<Meta> meta();

  static ImmutableOrganizationAffiliation.ResourceTypeBuildStage builder() {
    return ImmutableOrganizationAffiliation.builder();
  }
}
