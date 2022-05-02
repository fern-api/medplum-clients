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
  Optional<Meta> meta();

  Optional<List<Reference>> team();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<Reference> managingOrganization();

  Optional<List<Reference>> referralRequest();

  Optional<List<EpisodeOfCare_StatusHistory>> statusHistory();

  Optional<List<ResourceList>> contained();

  Optional<Reference> careManager();

  Optional<Period> period();

  Reference patient();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<EpisodeofcareStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> account();

  String resourceType();

  Optional<Id> id();

  Optional<List<EpisodeOfCare_Diagnosis>> diagnosis();

  Optional<List<CodeableConcept>> type();

  static ImmutableEpisodeOfCare.PatientBuildStage builder() {
    return ImmutableEpisodeOfCare.builder();
  }
}
