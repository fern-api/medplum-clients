package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableEpisodeOfCare.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EpisodeOfCare {
  Optional<List<Reference>> account();

  Optional<List<Extension>> extension();

  Optional<Period> period();

  Optional<Reference> managingOrganization();

  Optional<Id> id();

  Optional<List<EpisodeOfCare_Diagnosis>> diagnosis();

  Optional<List<Reference>> team();

  Optional<List<EpisodeOfCare_StatusHistory>> statusHistory();

  Optional<Reference> careManager();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> type();

  String resourceType();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<EpisodeofcareStatus> status();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> referralRequest();

  Reference patient();

  static ImmutableEpisodeOfCare.ResourceTypeBuildStage builder() {
    return ImmutableEpisodeOfCare.builder();
  }
}
