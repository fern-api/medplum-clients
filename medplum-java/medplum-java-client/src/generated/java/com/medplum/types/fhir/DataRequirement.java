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
    as = ImmutableDataRequirement.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DataRequirement {
  Optional<PositiveInt> limit();

  Optional<List<Canonical>> profile();

  Optional<List<String>> mustSupport();

  Optional<String> id();

  Optional<Reference> subjectReference();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<DataRequirement_CodeFilter>> codeFilter();

  Optional<Code> type();

  Optional<List<DataRequirement_DateFilter>> dateFilter();

  Optional<List<DataRequirement_Sort>> sort();

  static ImmutableDataRequirement.Builder builder() {
    return ImmutableDataRequirement.builder();
  }
}
