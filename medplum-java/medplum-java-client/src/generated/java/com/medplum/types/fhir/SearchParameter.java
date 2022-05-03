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
    as = ImmutableSearchParameter.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SearchParameter {
  Optional<List<Code>> target();

  Optional<List<SearchparameterComparatorItem>> comparator();

  Optional<Boolean> multipleOr();

  Optional<Id> id();

  Optional<String> version();

  Optional<List<Extension>> extension();

  Optional<List<UsageContext>> useContext();

  Optional<Markdown> purpose();

  Optional<Code> language();

  Optional<Uri> url();

  Optional<DateTime> date();

  Optional<Boolean> experimental();

  Optional<List<SearchparameterModifierItem>> modifier();

  Optional<Boolean> multipleAnd();

  Optional<Markdown> description();

  Optional<List<String>> chain();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<SearchparameterStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<Canonical> derivedFrom();

  Optional<String> xpath();

  String resourceType();

  Optional<List<SearchParameter_Component>> component();

  Optional<String> name();

  Optional<SearchparameterType> type();

  Optional<String> expression();

  Optional<Code> code();

  Optional<SearchparameterXpathusage> xpathUsage();

  Optional<List<Code>> base();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<String> publisher();

  Optional<List<ContactDetail>> contact();

  static ImmutableSearchParameter.ResourceTypeBuildStage builder() {
    return ImmutableSearchParameter.builder();
  }
}
