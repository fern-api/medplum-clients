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
  Optional<Reference> managingOrganization();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Reference patient();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<List<Reference>> account();

  Optional<List<Extension>> extension();

  Optional<List<CodeableConcept>> type();

  Optional<List<EpisodeOfCare_Diagnosis>> diagnosis();

  Optional<Period> period();

  Optional<List<Reference>> team();

  Optional<Code> language();

  Optional<List<Reference>> referralRequest();

  Optional<Reference> careManager();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<List<EpisodeOfCare_StatusHistory>> statusHistory();

  Optional<Narrative> text();

  Optional<EpisodeofcareStatus> status();

  static ImmutableEpisodeOfCare.PatientBuildStage builder() {
    return ImmutableEpisodeOfCare.builder();
  }
}
