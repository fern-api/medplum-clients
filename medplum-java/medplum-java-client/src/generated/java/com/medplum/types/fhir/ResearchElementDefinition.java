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
    as = ImmutableResearchElementDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchElementDefinition {
  Optional<String> version();

  Optional<DateTime> date();

  Optional<Date> approvalDate();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> name();

  Optional<List<Canonical>> library();

  Optional<Markdown> copyright();

  Optional<Meta> meta();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<String>> comment();

  Optional<ResearchelementdefinitionVariabletype> variableType();

  Optional<List<UsageContext>> useContext();

  Optional<String> subtitle();

  Optional<Narrative> text();

  Optional<Id> id();

  Optional<List<ContactDetail>> author();

  Optional<String> shortTitle();

  Optional<Boolean> experimental();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> description();

  Optional<Reference> subjectReference();

  Optional<List<ContactDetail>> endorser();

  Optional<String> title();

  Optional<String> usage();

  Optional<Code> language();

  Optional<Uri> url();

  Optional<List<ContactDetail>> reviewer();

  Optional<Uri> implicitRules();

  Optional<Period> effectivePeriod();

  String resourceType();

  Optional<String> publisher();

  Optional<ResearchelementdefinitionStatus> status();

  Optional<Date> lastReviewDate();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> contact();

  List<ResearchElementDefinition_Characteristic> characteristic();

  Optional<List<Identifier>> identifier();

  Optional<Markdown> purpose();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ContactDetail>> editor();

  Optional<List<ResourceList>> contained();

  Optional<ResearchelementdefinitionType> type();

  static ImmutableResearchElementDefinition.ResourceTypeBuildStage builder() {
    return ImmutableResearchElementDefinition.builder();
  }
}
