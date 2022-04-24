package com.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TestReport_Setup}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestReport_Setup.builder()}.
 */
@Generated(from = "TestReport_Setup", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestReport_Setup implements TestReport_Setup {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final List<TestReport_Action> action;

  private ImmutableTestReport_Setup(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      List<TestReport_Action> action) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.action = action;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public List<TestReport_Action> action() {
    return action;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Setup#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Setup withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestReport_Setup(newValue, this.modifierExtension, this.extension, this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Setup#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Setup withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestReport_Setup(value, this.modifierExtension, this.extension, this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Setup#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Setup withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestReport_Setup(this.id, newValue, this.extension, this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Setup#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Setup withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestReport_Setup(this.id, value, this.extension, this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport_Setup#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Setup withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestReport_Setup(this.id, this.modifierExtension, newValue, this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport_Setup#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport_Setup withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestReport_Setup(this.id, this.modifierExtension, value, this.action);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TestReport_Setup#action() action}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Setup withAction(TestReport_Action... elements) {
    List<TestReport_Action> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableTestReport_Setup(this.id, this.modifierExtension, this.extension, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TestReport_Setup#action() action}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of action elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport_Setup withAction(Iterable<? extends TestReport_Action> elements) {
    if (this.action == elements) return this;
    List<TestReport_Action> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableTestReport_Setup(this.id, this.modifierExtension, this.extension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestReport_Setup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestReport_Setup
        && equalTo((ImmutableTestReport_Setup) another);
  }

  private boolean equalTo(ImmutableTestReport_Setup another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && action.equals(another.action);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code extension}, {@code action}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + action.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TestReport_Setup} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestReport_Setup{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("action=").append(action);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestReport_Setup", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestReport_Setup {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable List<TestReport_Action> action = Collections.emptyList();
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("action")
    public void setAction(List<TestReport_Action> action) {
      this.action = action;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public List<TestReport_Action> action() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestReport_Setup fromJson(Json json) {
    ImmutableTestReport_Setup.Builder builder = ImmutableTestReport_Setup.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.action != null) {
      builder.addAllAction(json.action);
    }
    return (ImmutableTestReport_Setup) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestReport_Setup} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestReport_Setup instance
   */
  public static TestReport_Setup copyOf(TestReport_Setup instance) {
    if (instance instanceof ImmutableTestReport_Setup) {
      return (ImmutableTestReport_Setup) instance;
    }
    return ImmutableTestReport_Setup.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .addAllAction(instance.action())
        .build();
  }

  /**
   * Creates a builder for {@link TestReport_Setup TestReport_Setup}.
   * <pre>
   * ImmutableTestReport_Setup.builder()
   *    .id(String) // optional {@link TestReport_Setup#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestReport_Setup#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestReport_Setup#extension() extension}
   *    .addAction|addAllAction(com.fhir.TestReport_Action) // {@link TestReport_Setup#action() action} elements
   *    .build();
   * </pre>
   * @return A new TestReport_Setup builder
   */
  public static ImmutableTestReport_Setup.Builder builder() {
    return new ImmutableTestReport_Setup.Builder();
  }

  /**
   * Builds instances of type {@link TestReport_Setup TestReport_Setup}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestReport_Setup", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private final List<TestReport_Action> action = new ArrayList<TestReport_Action>();

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestReport_Setup#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Setup#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Setup#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Setup#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Setup#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport_Setup#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Adds one element to {@link TestReport_Setup#action() action} list.
     * @param element A action element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAction(TestReport_Action element) {
      this.action.add(Objects.requireNonNull(element, "action element"));
      return this;
    }

    /**
     * Adds elements to {@link TestReport_Setup#action() action} list.
     * @param elements An array of action elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAction(TestReport_Action... elements) {
      for (TestReport_Action element : elements) {
        this.action.add(Objects.requireNonNull(element, "action element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link TestReport_Setup#action() action} list.
     * @param elements An iterable of action elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAction(Iterable<? extends TestReport_Action> elements) {
      for (TestReport_Action element : elements) {
        this.action.add(Objects.requireNonNull(element, "action element"));
      }
      return this;
    }

    /**
     * Builds a new {@link TestReport_Setup TestReport_Setup}.
     * @return An immutable instance of TestReport_Setup
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestReport_Setup build() {
      return new ImmutableTestReport_Setup(id, modifierExtension, extension, createUnmodifiableList(true, action));
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestReport_Setup is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
