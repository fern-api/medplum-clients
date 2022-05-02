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
  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<String>> comment();

  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> contact();

  Optional<String> publisher();

  Optional<List<ContactDetail>> author();

  Optional<Date> lastReviewDate();

  Optional<String> name();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ContactDetail>> editor();

  List<ResearchElementDefinition_Characteristic> characteristic();

  Optional<String> version();

  Optional<Boolean> experimental();

  Optional<Markdown> purpose();

  Optional<ResearchelementdefinitionType> type();

  Optional<Id> id();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<ResearchelementdefinitionVariabletype> variableType();

  Optional<List<ResourceList>> contained();

  Optional<List<UsageContext>> useContext();

  Optional<String> usage();

  Optional<Code> language();

  Optional<String> subtitle();

  Optional<List<ContactDetail>> endorser();

  Optional<Date> approvalDate();

  Optional<Reference> subjectReference();

  Optional<Narrative> text();

  String resourceType();

  Optional<String> shortTitle();

  Optional<Meta> meta();

  Optional<DateTime> date();

  Optional<Uri> implicitRules();

  Optional<Markdown> copyright();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> url();

  Optional<List<Canonical>> library();

  Optional<List<Identifier>> identifier();

  Optional<String> title();

  Optional<Markdown> description();

  Optional<List<Extension>> extension();

  Optional<ResearchelementdefinitionStatus> status();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ContactDetail>> reviewer();

  static ImmutableResearchElementDefinition.ResourceTypeBuildStage builder() {
    return ImmutableResearchElementDefinition.builder();
  }
}
