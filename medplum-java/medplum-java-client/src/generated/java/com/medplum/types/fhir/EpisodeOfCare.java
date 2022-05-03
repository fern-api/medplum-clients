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
  Optional<List<CodeableConcept>> type();

  Optional<List<ResourceList>> contained();

  Optional<List<EpisodeOfCare_StatusHistory>> statusHistory();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<Period> period();

  Optional<List<Reference>> referralRequest();

  Optional<List<EpisodeOfCare_Diagnosis>> diagnosis();

  Optional<Uri> implicitRules();

  Optional<Reference> careManager();

  Optional<List<Reference>> account();

  Optional<EpisodeofcareStatus> status();

  Optional<List<Reference>> team();

  Optional<List<Identifier>> identifier();

  Reference patient();

  String resourceType();

  Optional<Reference> managingOrganization();

  Optional<Code> language();

  Optional<Id> id();

  static ImmutableEpisodeOfCare.PatientBuildStage builder() {
    return ImmutableEpisodeOfCare.builder();
  }
}
