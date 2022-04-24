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
    as = ImmutableDataRequirement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DataRequirement {
  Optional<List<DataRequirement_Sort>> sort();

  Optional<String> id();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<DataRequirement_DateFilter>> dateFilter();

  Optional<List<canonical>> profile();

  Optional<List<Extension>> extension();

  Optional<List<DataRequirement_CodeFilter>> codeFilter();

  Optional<positiveInt> limit();

  Optional<code> type();

  Optional<Reference> subjectReference();

  Optional<List<String>> mustSupport();

  static ImmutableDataRequirement.Builder builder() {
    return ImmutableDataRequirement.builder();
  }
}
