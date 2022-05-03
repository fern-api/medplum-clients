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
  Optional<List<Extension>> modifierExtension();

  Optional<String> subtitle();

  Optional<Date> lastReviewDate();

  Optional<Narrative> text();

  Optional<Period> effectivePeriod();

  Optional<List<RelatedArtifact>> relatedArtifact();

  String resourceType();

  Optional<Id> id();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<ContactDetail>> endorser();

  Optional<Reference> subjectReference();

  Optional<String> publisher();

  Optional<List<ContactDetail>> author();

  Optional<DateTime> date();

  Optional<Meta> meta();

  Optional<ResearchelementdefinitionVariabletype> variableType();

  Optional<List<ContactDetail>> editor();

  Optional<List<Identifier>> identifier();

  Optional<String> usage();

  Optional<Markdown> description();

  Optional<List<ResourceList>> contained();

  Optional<String> title();

  Optional<Uri> url();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Date> approvalDate();

  Optional<ResearchelementdefinitionStatus> status();

  Optional<List<ContactDetail>> contact();

  Optional<List<String>> comment();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<String> shortTitle();

  Optional<List<CodeableConcept>> topic();

  Optional<List<Canonical>> library();

  Optional<String> name();

  Optional<Markdown> purpose();

  List<ResearchElementDefinition_Characteristic> characteristic();

  Optional<List<UsageContext>> useContext();

  Optional<String> version();

  Optional<Markdown> copyright();

  Optional<Boolean> experimental();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Uri> implicitRules();

  Optional<ResearchelementdefinitionType> type();

  static ImmutableResearchElementDefinition.ResourceTypeBuildStage builder() {
    return ImmutableResearchElementDefinition.builder();
  }
}
