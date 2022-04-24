package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Reference patient();

  Optional<List<Reference>> account();

  Optional<Meta> meta();

  Optional<id> id();

  Optional<List<CodeableConcept>> type();

  Optional<List<Reference>> referralRequest();

  Optional<code> language();

  Optional<List<EpisodeOfCare_Diagnosis>> diagnosis();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> careManager();

  Optional<EpisodeofcareStatus> status();

  Optional<List<EpisodeOfCare_StatusHistory>> statusHistory();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<Reference> managingOrganization();

  Optional<uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> team();

  Optional<Period> period();

  String resourceType();

  static ImmutableEpisodeOfCare.PatientBuildStage builder() {
    return ImmutableEpisodeOfCare.builder();
  }
}
