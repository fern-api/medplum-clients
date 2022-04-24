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
    as = ImmutableResearchElementDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchElementDefinition {
  String resourceType();

  Optional<List<canonical>> library();

  Optional<List<CodeableConcept>> jurisdiction();

  List<ResearchElementDefinition_Characteristic> characteristic();

  Optional<ResearchelementdefinitionStatus> status();

  Optional<ResearchelementdefinitionType> type();

  Optional<Narrative> text();

  Optional<markdown> description();

  Optional<List<String>> comment();

  Optional<List<ContactDetail>> editor();

  Optional<List<ResourceList>> contained();

  Optional<String> usage();

  Optional<List<CodeableConcept>> topic();

  Optional<Boolean> experimental();

  Optional<List<UsageContext>> useContext();

  Optional<markdown> copyright();

  Optional<List<ContactDetail>> reviewer();

  Optional<String> subtitle();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<String> name();

  Optional<String> shortTitle();

  Optional<List<ContactDetail>> author();

  Optional<List<ContactDetail>> endorser();

  Optional<date> lastReviewDate();

  Optional<String> title();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> url();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<dateTime> date();

  Optional<markdown> purpose();

  Optional<List<ContactDetail>> contact();

  Optional<date> approvalDate();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<uri> implicitRules();

  Optional<String> publisher();

  Optional<List<Extension>> extension();

  Optional<Reference> subjectReference();

  Optional<Period> effectivePeriod();

  Optional<List<Identifier>> identifier();

  Optional<code> language();

  Optional<String> version();

  Optional<ResearchelementdefinitionVariabletype> variableType();

  static ImmutableResearchElementDefinition.ResourceTypeBuildStage builder() {
    return ImmutableResearchElementDefinition.builder();
  }
}
