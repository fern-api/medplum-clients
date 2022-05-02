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
  Optional<Meta> meta();

  Optional<List<Canonical>> library();

  Optional<ResearchelementdefinitionType> type();

  Optional<List<ContactDetail>> editor();

  Optional<List<ContactDetail>> reviewer();

  Optional<Uri> url();

  Optional<Uri> implicitRules();

  Optional<Markdown> description();

  Optional<Period> effectivePeriod();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<ResearchelementdefinitionStatus> status();

  Optional<Markdown> copyright();

  Optional<List<ContactDetail>> author();

  Optional<Date> approvalDate();

  Optional<Reference> subjectReference();

  Optional<List<Extension>> modifierExtension();

  Optional<Date> lastReviewDate();

  Optional<Boolean> experimental();

  Optional<String> name();

  List<ResearchElementDefinition_Characteristic> characteristic();

  Optional<List<String>> comment();

  Optional<List<ContactDetail>> endorser();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> topic();

  Optional<String> shortTitle();

  Optional<String> title();

  Optional<List<UsageContext>> useContext();

  Optional<Markdown> purpose();

  Optional<DateTime> date();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<String> publisher();

  Optional<Code> language();

  Optional<ResearchelementdefinitionVariabletype> variableType();

  Optional<String> subtitle();

  String resourceType();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<String> version();

  Optional<String> usage();

  Optional<List<ContactDetail>> contact();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  static ImmutableResearchElementDefinition.ResourceTypeBuildStage builder() {
    return ImmutableResearchElementDefinition.builder();
  }
}
